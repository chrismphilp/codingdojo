// #[derive(Debug, PartialEq, Eq)]

use std::cell::RefCell;
use std::rc::Rc;

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

pub fn is_same_tree(p: Option<Rc<RefCell<TreeNode>>>, q: Option<Rc<RefCell<TreeNode>>>) -> bool {
    match (p, q) {
        (None, None) => true,
        (Some(p), Some(q)) => {
            let pb = &p.borrow();
            let qb = &q.borrow();

            pb.val == qb.val &&
                is_same_tree(pb.left.clone(), qb.left.clone()) &&
                is_same_tree(pb.right.clone(), qb.right.clone())
        }
        _ => false
    }
}

#[cfg(test)]
mod tests {
    use std::cell::RefCell;
    use std::rc::Rc;

    use super::{is_same_tree, TreeNode};

    #[test]
    fn should_return_true_for_empty_trees() {
        assert_eq!(true, is_same_tree(None, None));
    }

    #[test]
    fn should_compare_single_node_trees() {
        assert_eq!(false, is_same_tree(
            Some(Rc::new(RefCell::new(TreeNode::new(1)))),
            Some(Rc::new(RefCell::new(TreeNode::new(0)))))
        );
        assert_eq!(true, is_same_tree(
            Some(Rc::new(RefCell::new(TreeNode::new(0)))),
            Some(Rc::new(RefCell::new(TreeNode::new(0)))))
        );
    }

    #[test]
    fn should_return_true_for_same_multi_node_trees() {
        let mut root1 = TreeNode::new(1);
        root1.left = Some(Rc::new(RefCell::new(TreeNode::new(2))));
        root1.right = Some(Rc::new(RefCell::new(TreeNode::new(3))));

        let mut root2 = TreeNode::new(1);
        root2.left = Some(Rc::new(RefCell::new(TreeNode::new(2))));
        root2.right = Some(Rc::new(RefCell::new(TreeNode::new(3))));

        assert_eq!(true, is_same_tree(
            Some(Rc::new(RefCell::new(root1))),
            Some(Rc::new(RefCell::new(root2)))
        ))
    }

    #[test]
    fn should_return_false_for_different_multi_node_trees() {
        let mut root1 = TreeNode::new(1);
        root1.left = Some(Rc::new(RefCell::new(TreeNode::new(2))));
        root1.right = Some(Rc::new(RefCell::new(TreeNode::new(3))));

        let mut root2 = TreeNode::new(1);
        root2.left = Some(Rc::new(RefCell::new(TreeNode::new(2))));
        root2.right = Some(Rc::new(RefCell::new(TreeNode::new(2))));

        assert_eq!(false, is_same_tree(
            Some(Rc::new(RefCell::new(root1))),
            Some(Rc::new(RefCell::new(root2)))
        ))
    }
}
