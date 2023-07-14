import { WebPlugin } from '@capacitor/core';

import type { LaunchReviewPlugin } from './definitions';

export class LaunchReviewWeb extends WebPlugin implements LaunchReviewPlugin {
  async launch(): Promise<void>{
    throw this.unimplemented('Not implemented on web.');
  }
}
