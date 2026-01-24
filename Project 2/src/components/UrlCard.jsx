import React from 'react';
import { Copy, Check, TrendingUp, Users, Clock, ExternalLink } from 'lucide-react';
import { useClipboard } from '../hooks/useClipboard';
import { DeviceBreakdown } from './DeviceBreakdown';

export const UrlCard = ({ url }) => {
  const { copied, copyToClipboard } = useClipboard();
  
  const formatDate = (dateString) => new Date(dateString).toLocaleDateString('en-US', {
    month: 'short', day: 'numeric', hour: '2-digit', minute: '2-digit'
  });

  return (
    <div className="border border-gray-200 rounded-lg p-4 hover:shadow-md transition-shadow">
      <div className="flex flex-col md:flex-row md:items-center justify-between">
        <div className="mb-4 md:mb-0">
          <div className="flex items-center mb-2">
            <span className="text-indigo-600 font-medium text-lg">{url.shortUrl}</span>
            <ExternalLink className="w-4 h-4 ml-2 text-gray-400" />
          </div>
          <p className="text-gray-500 text-sm truncate max-w-md">{url.originalUrl}</p>
        </div>
        
        <div className="flex flex-wrap gap-3">
          <button onClick={() => copyToClipboard(url.shortUrl)} className="flex items-center px-3 py-1.5 bg-gray-100 rounded-lg text-sm">
            {copied ? <Check className="w-4 h-4 mr-1 text-green-600" /> : <Copy className="w-4 h-4 mr-1" />}
            {copied ? 'Copied!' : 'Copy'}
          </button>
          <div className="flex items-center bg-blue-50 px-3 py-1.5 rounded-lg text-blue-800 text-sm font-medium">
            <TrendingUp className="w-4 h-4 mr-1" /> {url.clicks} clicks
          </div>
        </div>
      </div>
      <DeviceBreakdown devices={url.devices} />
    </div>
  );
};