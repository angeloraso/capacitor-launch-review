import Foundation

@objc public class LaunchReview: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
