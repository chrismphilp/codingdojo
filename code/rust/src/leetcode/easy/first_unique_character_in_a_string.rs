pub fn first_uniq_char(s: String) -> i32 {
    let mut characters = vec![0; 26];

    for c in s.as_bytes() {
        let index = (c - b'a') as usize;
        characters[index] = characters[index] + 1;
    }
    for (i, c) in characters.iter().enumerate() {
        let index = (c - b'a') as usize;

        if characters[index] == 1 {
            return i as i32;
        }
    }
    0
}

#[cfg(test)]
mod tests {

    #[test]
    fn should_() {

    }
}
