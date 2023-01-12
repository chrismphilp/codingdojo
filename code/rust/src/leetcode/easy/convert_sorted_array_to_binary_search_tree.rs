use std::cell::RefCell;
use std::rc::Rc;

#[derive(Debug, PartialEq, Eq)]
pub struct TreeNode {
    pub val: i32,
    pub left: Option<Rc<RefCell<TreeNode>>>,
    pub right: Option<Rc<RefCell<TreeNode>>>,
}

impl TreeNode {
    #[inline]
    pub fn new(val: i32) -> Self {
        TreeNode {
            val,
            left: None,
            right: None,
        }
    }
}

pub fn sorted_array_to_bst(nums: Vec<i32>) -> Option<Rc<RefCell<TreeNode>>> {
    sorted_slice_to_bst(&nums)
}

fn sorted_slice_to_bst(nums: &[i32]) -> Option<Rc<RefCell<TreeNode>>> {
    if nums.len() == 0 {
        None
    } else {
        let (left, rem) = nums.split_at(nums.len() / 2);
        let (mid, right) = rem.split_first().unwrap();
        Some(Rc::new(RefCell::new(TreeNode {
            val: *mid,
            left: sorted_slice_to_bst(left),
            right: sorted_slice_to_bst(right),
        })))
    }
}

#[cfg(test)]
mod tests {
    use std::cell::RefCell;
    use std::rc::Rc;

    use super::{sorted_array_to_bst, TreeNode};

    #[test]
    fn should_return_empty_tree_for_empty_vector() {
        assert_eq!(None, sorted_array_to_bst(vec!()))
    }

    #[test]
    fn should_return_single_node_tree_for_single_node_vector() {
        assert_eq!(Some(Rc::new(RefCell::new(TreeNode::new(1)))), sorted_array_to_bst(vec!(1)))
    }

    #[test]
    fn should_return_multi_node_tree_for_multi_node_vector() {
        let input = vec!(1, 2, 3);
        let mut root = TreeNode::new(2);
        root.left = Some(Rc::new(RefCell::new(TreeNode::new(1))));
        root.right = Some(Rc::new(RefCell::new(TreeNode::new(3))));
        assert_eq!(Some(Rc::new(RefCell::new(root))), sorted_array_to_bst(input))
    }
}
