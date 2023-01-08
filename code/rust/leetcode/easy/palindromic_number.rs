pub fn is_palindrome(x: i32) -> bool {
    let x_string = x.to_string();
    let x_chars = x_string.as_bytes();
    let mut lower_bound: usize = 0;
    let mut upper_bound: usize = x_chars.len() - 1;


    while lower_bound < upper_bound {
        if x_chars[lower_bound] != x_chars[upper_bound] {
            return false
        }
        lower_bound += 1;
        upper_bound -= 1;
    }
    true
}
