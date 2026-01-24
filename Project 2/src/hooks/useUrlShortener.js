import { useState, useCallback } from 'react';

export const useUrlShortener = () => {
  const [urls, setUrls] = useState([]);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState('');

  const shortenUrl = useCallback(async (originalUrl) => {
    setLoading(true);
    setError('');
    
    try {
      new URL(originalUrl);
      await new Promise(resolve => setTimeout(resolve, 800)); // Simulating API
      
      const shortCode = Math.random().toString(36).substring(2, 8);
      const newUrl = {
        id: shortCode,
        originalUrl,
        shortUrl: `sho.rt/${shortCode}`,
        createdAt: new Date().toISOString(),
        clicks: 0,
        uniqueVisitors: 0,
        referrers: ['direct'],
        devices: { desktop: 0, mobile: 0, tablet: 0 }
      };
      
      setUrls(prev => [newUrl, ...prev]);
      return newUrl.shortUrl;
    } catch (err) {
      setError(err instanceof TypeError ? 'Please enter a valid URL' : 'Failed to shorten URL');
      throw err;
    } finally {
      setLoading(false);
    }
  }, []);

  return { urls, loading, error, shortenUrl, setUrls };
};