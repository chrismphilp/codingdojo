pub fn is_palindrome(x: i32) -> bool {
    let x_string = x.to_string();
    let x_chars = x_string.as_bytes();
    let mut lower_bound: usize = 0;
    let mut upper_bound: usize = x_chars.len() - 1;

    while lower_bound < upper_bound {
        if x_chars[lower_bound] != x_chars[upper_bound] {
            return false;
        }
        lower_bound += 1;
        upper_bound -= 1;
    }
    true
}

#[cfg(test)]
mod tests {
    use super::is_palindrome;

    #[test]
    fn should_return_false_for_any_negative_integer() {
        assert_eq!(false, is_palindrome(-1));
        assert_eq!(false, is_palindrome(-500));
    }

    #[test]
    fn should_return_false_for_any_non_palindromic_positive_integer() {
        assert_eq!(false, is_palindrome(1005));
        assert_eq!(false, is_palindrome(100500));
        assert_eq!(false, is_palindrome(111110));
        assert_eq!(false, is_palindrome(12));
    }

    #[test]
    fn should_return_true_for_any_palindromic_positive_integer() {
        assert_eq!(true, is_palindrome(1));
        assert_eq!(true, is_palindrome(1001));
        assert_eq!(true, is_palindrome(111));
        assert_eq!(true, is_palindrome(151));
        assert_eq!(true, is_palindrome(50505));
    }
}
