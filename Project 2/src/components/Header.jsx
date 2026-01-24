import React from 'react';
import { Link as LinkIcon } from 'lucide-react';

export const Header = () => (
  <header className="mb-12 text-center">
    <div className="flex items-center justify-center mb-4">
      <LinkIcon className="w-10 h-10 text-indigo-600 mr-3" />
      <h1 className="text-4xl font-bold text-gray-800">URL Shortener</h1>
    </div>
    <p className="text-gray-600 max-w-2xl mx-auto">
      Transform long URLs into short links. Track clicks and analyze traffic.
    </p>
  </header>
);