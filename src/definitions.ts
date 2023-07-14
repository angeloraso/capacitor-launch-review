export interface LaunchReviewPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
