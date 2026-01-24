import React from 'react';
import { BarChart3 } from 'lucide-react';
import { UrlCard } from './UrlCard';

export const AnalyticsDashboard = ({ urls }) => (
  <div className="bg-white rounded-xl shadow-lg p-6">
    <div className="flex items-center mb-6">
      <BarChart3 className="w-6 h-6 text-indigo-600 mr-2" />
      <h2 className="text-2xl font-bold text-gray-800">Analytics Dashboard</h2>
    </div>
    {urls.length === 0 ? (
      <p className="text-center py-12 text-gray-500">No URLs shortened yet.</p>
    ) : (
      <div className="space-y-6">
        {urls.map((url) => <UrlCard key={url.id} url={url} />)}
      </div>
    )}
  </div>
);
