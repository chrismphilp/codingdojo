pub fn generate(num_rows: i32) -> Vec<Vec<i32>> {
    let mut res: Vec<Vec<i32>> = vec!(vec!(1));

    for x in 1..num_rows as usize {
        let prev: &Vec<i32> = &res[x - 1];
        let mut curr = vec![1; x + 1];

        for y in 1..x as usize {
            curr[y] = prev[y] + prev[y - 1];
        }

        res.push(curr);
    }
    res
}

#[cfg(test)]
mod tests {
    use super::generate;

    #[test]
    fn should_generate_single_index_vector() {
        assert_eq!(vec!(vec!(1)), generate(1));
    }

    #[test]
    fn should_generate_multi_index_vector() {
        assert_eq!(vec!(vec!(1), vec!(1, 1)), generate(2));
        assert_eq!(vec!(vec!(1), vec!(1, 1), vec!(1, 2, 1)), generate(3));
        assert_eq!(vec!(vec!(1), vec!(1, 1), vec!(1, 2, 1), vec!(1, 3, 3, 1)), generate(4));
        assert_eq!(vec!(vec!(1), vec!(1, 1), vec!(1, 2, 1), vec!(1, 3, 3, 1), vec!(1, 4, 6, 4, 1)), generate(5));
    }
}
