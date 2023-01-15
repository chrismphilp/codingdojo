pub fn get_row(row_index: i32) -> Vec<i32> {
    let mut res: Vec<i32> = vec!(1);

    for x in 1..(row_index + 1) as usize {
        for y in 1..x as usize {
            res[y - 1] = res[y - 1] + res[y];
        }

        res.insert(0, 1);
    }
    res
}

#[cfg(test)]
mod tests {
    use super::get_row;

    #[test]
    fn should_get_row_for_single_index_vector() {
        assert_eq!(vec!(1), get_row(0));
    }

    #[test]
    fn should_get_row_for_multi_index_vector() {
        assert_eq!(vec!(1, 1), get_row(1));
        assert_eq!(vec!(1, 2, 1), get_row(2));
        assert_eq!(vec!(1, 3, 3, 1), get_row(3));
        assert_eq!(vec!(1, 4, 6, 4, 1), get_row(4));
    }
}
