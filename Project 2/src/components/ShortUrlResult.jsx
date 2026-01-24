import React from 'react';
import { Globe, Copy, Check, ExternalLink } from 'lucide-react';
import { useClipboard } from '../hooks/useClipboard';

export const ShortUrlResult = ({ shortUrl, onCopy }) => {
  const { copied, copyToClipboard } = useClipboard();

  const handleCopy = async () => {
    await copyToClipboard(shortUrl);
    if (onCopy) onCopy();
  };

  if (!shortUrl) return null;

  return (
    <div className="mt-6 p-4 bg-green-50 rounded-lg border border-green-200">
      <div className="flex items-center justify-between">
        <div className="flex items-center text-green-800 font-medium">
          <Globe className="w-5 h-5 mr-2" /> Shortened URL:
        </div>
        <button onClick={handleCopy} className="flex items-center text-green-600 hover:text-green-800">
          {copied ? <Check className="w-4 h-4 mr-1" /> : <Copy className="w-4 h-4 mr-1" />}
          {copied ? 'Copied!' : 'Copy'}
        </button>
      </div>
      <div className="mt-2 flex items-center">
        <a href={`https://${shortUrl}`} target="_blank" rel="noreferrer" className="text-indigo-600 font-medium break-all">
          {shortUrl}
        </a>
        <ExternalLink className="w-4 h-4 ml-2 text-gray-500" />
      </div>
    </div>
  );
};