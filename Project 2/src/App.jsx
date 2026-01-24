import React, { useState } from 'react';
import { useUrlShortener } from './hooks/useUrlShortener';
import { Header } from './components/Header';
import { UrlForm } from './components/UrlForm';
import { ShortUrlResult } from './components/ShortUrlResult';
import { AnalyticsDashboard } from './components/AnalyticsDashboard';

const App = () => {
  const { urls, loading, error, shortenUrl } = useUrlShortener();
  const [shortUrl, setShortUrl] = useState('');

  const handleShorten = async (url) => {
    const result = await shortenUrl(url);
    setShortUrl(result);
  };

  return (
    <div className="min-h-screen bg-gradient-to-br from-blue-50 to-indigo-100">
      <div className="container mx-auto px-4 py-8">
        <Header />
        <div className="max-w-4xl mx-auto">
          <UrlForm onShorten={handleShorten} loading={loading} error={error} />
          <ShortUrlResult shortUrl={shortUrl} onCopy={() => setTimeout(() => setShortUrl(''), 2000)} />
          <AnalyticsDashboard urls={urls} />
        </div>
      </div>
    </div>
  );
};

export default App;