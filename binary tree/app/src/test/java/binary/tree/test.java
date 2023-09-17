public class BinaryTreeTest {

    private BinaryTree binaryTree;

    @BeforeEach
    void setUp() {
        binaryTree = new BinaryTree();

        // Build a sample binary tree for testing
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        binaryTree.root = root;
    }

    @Test
    void testPreOrderTraversal() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);

        List<Integer> result = new ArrayList<>();
        binaryTree.preOrder(result);

        assertEquals(expected, result);
    }

    @Test
    void testInOrderTraversal() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(1);
        expected.add(3);

        List<Integer> result = new ArrayList<>();
        binaryTree.inOrder(result);

        assertEquals(expected, result);
    }

    @Test
    void testPostOrderTraversal() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(1);

        List<Integer> result = new ArrayList<>();
        binaryTree.postOrder(result);

        assertEquals(expected, result);
    }