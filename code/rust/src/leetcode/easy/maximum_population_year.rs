pub fn maximum_population(logs: Vec<Vec<i32>>) -> i32 {
    let mut year_counts: Vec<i32> = vec![0; 100];

    for x in logs {
        let lower_bound = x[0] - 1950;
        let upper_bound = x[1] - 1950;

        for y in lower_bound..upper_bound {
            year_counts[y as usize] += 1;
        }
    }

    let mut min = -1;
    let mut max_population_year: i32 = 1950;

    for (i, x) in year_counts.iter().enumerate() {
        if *x > min {
            max_population_year = i as i32 + 1950;
            min = *x;
        }
    }
    max_population_year
}

#[cfg(test)]
mod tests {
    use super::maximum_population;

    #[test]
    fn should_return_earliest_year_for_single_birth_and_death() {
        assert_eq!(1990, maximum_population(vec!(vec!(1990, 2000))));
    }

    #[test]
    fn should_return_earliest_year_for_same_birth_and_death() {
        assert_eq!(2049, maximum_population(vec!(
            vec!(2049, 2050),
            vec!(2049, 2050),
        )));
    }

    #[test]
    fn should_get_earliest_year_for_multiple_index_vector() {
        assert_eq!(1993, maximum_population(vec!(
            vec!(1993, 1999),
            vec!(2000, 2010),
        )));
    }

    #[test]
    fn should_get_earliest_year_for_multiple_max_population_years() {
        assert_eq!(1960, maximum_population(vec!(
            vec!(1950,1961),
            vec!(1960,1971),
            vec!(1970,1981),
        )));
    }

    #[test]
    fn should_get_earliest_year_for_multiple_max_population_years_near_end_of_range() {
        assert_eq!(2022, maximum_population(vec!(
            vec!(1982,1998),
            vec!(2013,2042),
            vec!(2010,2035),
            vec!(2022,2050),
            vec!(2047,2048),
        )));
    }
}
