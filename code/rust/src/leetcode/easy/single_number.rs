pub fn single_number(nums: Vec<i32>) -> i32 {
    let mut sum = 0;

    for i in nums {
        sum = sum ^ i;
    }
    sum
}

#[cfg(test)]
mod tests {
    use super::single_number;

    #[test]
    fn should_return_value_for_single_item_array() {
        assert_eq!(-1, single_number(vec!(-1)));
        assert_eq!(0, single_number(vec!(0)));
        assert_eq!(1, single_number(vec!(1)));
    }

    #[test]
    fn should_return_value_for_multi_item_array() {
        assert_eq!(2, single_number(vec!(1, 1, 2)));
        assert_eq!(1, single_number(vec!(1, 2, 2)));
        assert_eq!(3, single_number(vec!(1, 2, 3, 2, 1)));
        assert_eq!(5, single_number(vec!(1, 1, 2, 2, 3, 3, 4, 4, 5)));
        assert_eq!(4, single_number(vec!(4, 1, 2, 1, 2)));
        assert_eq!(4, single_number(vec!(1, 4, 2, 1, 2)));
    }
}
