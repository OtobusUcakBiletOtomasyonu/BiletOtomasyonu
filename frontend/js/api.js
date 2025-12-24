const API_BASE_URL = 'http://localhost:8080'; 

async function apiCall(endpoint, method = 'GET', body = null) {
    try {
        const options = {
            method: method,
            headers: {
                'Content-Type': 'application/json',
            }
        };

        if (body) {
            options.body = JSON.stringify(body);
        }

        const response = await fetch(`${API_BASE_URL}${endpoint}`, options);
        
        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }
        
        return await response.json();
    } catch (error) {
        console.error('API çağrısı hatası:', error);
        throw error;
    }
}

const SeferAPI = {
    
    ara: async (kalkis, varis, tarih) => {
        return apiCall(`/sefer/ara?kalkis=${encodeURIComponent(kalkis)}&varis=${encodeURIComponent(varis)}&tarih=${encodeURIComponent(tarih)}`);
    },
    
    listele: async () => {
        return apiCall('/sefer/liste');
    },
    
    getir: async (id) => {
        return apiCall(`/sefer/${id}`);
    }
};


const KoltukAPI = {
    seferKoltuklari: async (seferId) => {
        return apiCall(`/koltuk/sefer/${seferId}`);
    },
    
    durumDegistir: async (koltukId, durum) => {
        return apiCall(`/koltuk/durum/${koltukId}?durum=${durum}`, 'POST');
    }
};

const YolcuAPI = {
    ekle: async (yolcu) => {
        return apiCall('/yolcu/ekle', 'POST', yolcu);
    },
    
    getir: async (id) => {
        return apiCall(`/yolcu/${id}`);
    }
};

const BiletAPI = {
    al: async (yolcuId, seferId, koltukId, ekstraHizmetler = {}) => {
        const params = new URLSearchParams({
            yolcuId,
            seferId,
            koltukId,
            vip: ekstraHizmetler.vip || false,
            sigorta: ekstraHizmetler.sigorta || false,
            ikram: ekstraHizmetler.ikram || false,
            bagaj: ekstraHizmetler.bagaj || false,
            hizliCheckIn: ekstraHizmetler.hizliCheckIn || false
        });
        return apiCall(`/bilet/al?${params}`, 'POST');
    },
    
    iptal: async (biletId) => {
        return apiCall(`/bilet/iptal/${biletId}`, 'DELETE');
    },
    
    getir: async (id) => {
        return apiCall(`/bilet/${id}`);
    },
    
    listele: async () => {
        return apiCall('/bilet/liste');
    }
};

const OdemeAPI = {
    yap: async (biletId, tutar, tur) => {
        return apiCall(`/odeme/yap?biletId=${biletId}&tutar=${tutar}&tur=${tur}`, 'POST');
    },
    
    getir: async (id) => {
        return apiCall(`/odeme/${id}`);
    }
};

window.API = {
    Sefer: SeferAPI,
    Koltuk: KoltukAPI,
    Yolcu: YolcuAPI,
    Bilet: BiletAPI,
    Odeme: OdemeAPI
};




