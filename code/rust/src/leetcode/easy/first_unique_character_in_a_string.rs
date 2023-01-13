use std::collections::HashMap;

pub fn first_uniq_char(s: String) -> i32 {
    let chars: Vec<char> = s.chars().collect();
    let mut character_counts: HashMap<char, i32> = HashMap::new();

    for c in chars.iter() {
        *character_counts.entry(*c).or_insert(0) += 1;
    }
    for (i, c) in chars.iter().enumerate() {
        if character_counts[c] == 1 {
            return i as i32;
        }
    }
    -1
}

#[cfg(test)]
mod tests {
    use super::first_uniq_char;

    #[test]
    fn should_return_zero_index_for_single_char_string() {
        assert_eq!(0, first_uniq_char(String::from("a")));
    }

    #[test]
    fn should_return_negative_one_index_for_non_existing_unique_character() {
        assert_eq!(-1, first_uniq_char(String::from("aabbccddee")));
    }

    #[test]
    fn should_return_first_index_for_string() {
        assert_eq!(0, first_uniq_char(String::from("abbccdd")));
    }

    #[test]
    fn should_return_last_index_for_string() {
        assert_eq!(8, first_uniq_char(String::from("aabbccdde")));
    }

    #[test]
    fn should_return_middle_index_for_string() {
        assert_eq!(4, first_uniq_char(String::from("aabbcddee")));
    }
}
