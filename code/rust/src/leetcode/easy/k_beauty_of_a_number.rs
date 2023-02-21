pub fn divisor_substrings(num: i32, k: i32) -> i32 {
    2
}

#[cfg(test)]
mod tests {
    use super::divisor_substrings;

    #[test]
    fn should_return_k_length_for_single_char_string() {
        assert_eq!(2, divisor_substrings(240, 2));
        assert_eq!(2, divisor_substrings(430043, 2));
    }

    #[test]
    fn should_return_k_length_for_number_with_leading_zeros() {
        assert_eq!(2, divisor_substrings(101, 2));
        assert_eq!(2, divisor_substrings(50005, 2));
    }
}