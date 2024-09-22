#include <iostream>

/*
 * Given the root of a binary tree, flatten the tree into a "linked list":
 *
 * The "linked list" should use the same TreeNode class 
 * where the right child pointer points to the next node in the list 
 * and the left child pointer is always null.
 * 
 * The "linked list" should be in the same order as a pre-order traversal of the binary tree.
*/

struct TreeNode{
  int val;
  TreeNode* left;
  TreeNode* right;

  TreeNode(int val): val(val), left(nullptr), right(nullptr){}
  TreeNode(int val, TreeNode* left, TreeNode* right): val(val), left(left), right(right){}
};

class Traversal{
  public:
    void traverse(TreeNode* root){
        if(!root) {
          std::cout << "Null ";
          return;
        }
        std::cout << root->val << " ";
        traverse(root->left);
        traverse(root->right);
    }
};

class Solution{
  private:
    TreeNode* prev = nullptr;
  public:
    void flattenUsingRecursion(TreeNode* root){
      if(!root) return;
      flattenUsingRecursion(root->right);
      flattenUsingRecursion(root->left);

      root->right = prev;
      root->left = nullptr;
      prev = root;
    }

    void flattenInConstantSpace(TreeNode* root){
        TreeNode* curr = root;
        while(curr){
            //If a left SubTree exist, find the right most Node
            //On the left subTree and connect it's right to right node
            //of curr Node
            //Then move left SubTree of Curr Node to right subTree of Curr Node
            //Make left sub Tree of curr Node as null
            if(curr->left){
                TreeNode* next = curr->left;
                while(next->right) next = next->right;
                next->right = curr->right;
                curr->right = curr->left;
                curr->left = nullptr;
            }
            //Move curr to curr->right as we have moved left sub tree to right
            curr = curr->right;
        }
    }
};

int main(){
  TreeNode* root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(5, nullptr, new TreeNode(6)));
  Solution s;
  Traversal t;
  s.flattenUsingRecursion(root);
  t.traverse(root);
  std::cout<< std::endl;
  root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(5, nullptr, new TreeNode(6)));
  s.flattenInConstantSpace(root);
  t.traverse(root);
  std::cout << std::endl;
}