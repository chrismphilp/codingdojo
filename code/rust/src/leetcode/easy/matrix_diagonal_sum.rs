pub fn diagonal_sum(mat: Vec<Vec<i32>>) -> i32 {
    let mut sum: i32 = 0;
    let mut x = 0;
    let mut y = mat.len() - 1;
    let max_length = mat.len() - 1;

    if max_length == 0 {
        return mat[0][0];
    }

    while x <= y {
        if x == y {
            sum += mat[x][x];
        } else {
            sum += mat[x][x] + mat[max_length - x][x] + mat[y][y] + mat[max_length - y][y];
        }
        x += 1;
        y -= 1;
    }
    sum
}

#[cfg(test)]
mod tests {
    use super::diagonal_sum;

    #[test]
    fn should_get_sum_for_single_index_vector() {
        assert_eq!(5, diagonal_sum(vec!(vec!(5))));
    }

    #[test]
    fn should_get_sum_for_multi_index_vector() {
        assert_eq!(10, diagonal_sum(vec!(
            vec!(1, 2),
            vec!(3, 4)))
        );
        assert_eq!(25, diagonal_sum(vec!(
            vec!(1, 2, 3),
            vec!(4, 5, 6),
            vec!(7, 8, 9)))
        );
        assert_eq!(68, diagonal_sum(vec!(
            vec!(1, 2, 3, 4),
            vec!(5, 6, 7, 8),
            vec!(9, 10, 11, 12),
            vec!(13, 14, 15, 16)))
        );
    }
}