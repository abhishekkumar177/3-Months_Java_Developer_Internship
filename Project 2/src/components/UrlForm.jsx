import React, { useState } from 'react';
import { Loader2, AlertCircle } from 'lucide-react';

export const UrlForm = ({ onShorten, loading, error }) => {
  const [originalUrl, setOriginalUrl] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    if (!originalUrl.trim()) return;
    try {
      await onShorten(originalUrl);
      setOriginalUrl('');
    } catch (err) {}
  };

  return (
    <div className="bg-white rounded-xl shadow-lg p-6 mb-8">
      <form onSubmit={handleSubmit}>
        <div className="mb-4">
          <label className="block text-sm font-medium text-gray-700 mb-2">Enter your long URL</label>
          <div className="flex">
            <input
              type="url"
              value={originalUrl}
              onChange={(e) => setOriginalUrl(e.target.value)}
              placeholder="https://example.com/long-url"
              className="flex-1 px-4 py-3 border border-gray-300 rounded-l-lg outline-none focus:ring-2 focus:ring-indigo-500"
              disabled={loading}
            />
            <button
              type="submit"
              disabled={loading || !originalUrl.trim()}
              className="bg-indigo-600 hover:bg-indigo-700 text-white px-6 py-3 rounded-r-lg font-medium disabled:opacity-50"
            >
              {loading ? <Loader2 className="w-4 h-4 animate-spin" /> : 'Shorten'}
            </button>
          </div>
          {error && (
            <div className="mt-2 flex items-center text-red-600 text-sm">
              <AlertCircle className="w-4 h-4 mr-1" /> {error}
            </div>
          )}
        </div>
      </form>
    </div>
  );
};