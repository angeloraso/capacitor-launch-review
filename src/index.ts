import { registerPlugin } from '@capacitor/core';

import type { LaunchReviewPlugin } from './definitions';

const LaunchReview = registerPlugin<LaunchReviewPlugin>('LaunchReview', {
  web: () => import('./web').then(m => new m.LaunchReviewWeb()),
});

export * from './definitions';
export { LaunchReview };
