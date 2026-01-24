import React from 'react';

export const DeviceBreakdown = ({ devices }) => {
  const total = devices.desktop + devices.mobile + devices.tablet;
  if (total === 0) return null;

  return (
    <div className="mt-4 pt-4 border-t border-gray-100">
      <div className="flex items-center justify-between text-sm text-gray-600 mb-2">
        <span>Device breakdown</span>
        <span>Total: {total}</span>
      </div>
      <div className="flex space-x-2">
        <div className="flex-1 bg-gray-100 rounded-full h-2">
          <div className="bg-blue-500 h-2 rounded-full" style={{ width: `${(devices.desktop / total) * 100}%` }}></div>
        </div>
        <div className="flex-1 bg-gray-100 rounded-full h-2">
          <div className="bg-green-500 h-2 rounded-full" style={{ width: `${(devices.mobile / total) * 100}%` }}></div>
        </div>
        <div className="flex-1 bg-gray-100 rounded-full h-2">
          <div className="bg-purple-500 h-2 rounded-full" style={{ width: `${(devices.tablet / total) * 100}%` }}></div>
        </div>
      </div>
    </div>
  );
};