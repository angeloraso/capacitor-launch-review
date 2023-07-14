import { WebPlugin } from '@capacitor/core';

import type { LaunchReviewPlugin } from './definitions';

export class LaunchReviewWeb extends WebPlugin implements LaunchReviewPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
