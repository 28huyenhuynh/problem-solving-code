class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int init = image[sr][sc];
       if (init == color) return image;
       dfs(image, sr, sc, init, color);
       return image;

}
private void dfs(int[][] img, int i, int j, int init, int color){ //
    if (i < 0 || i >= img.length || j < 0 || j >= img[0].length) return;
    if (img[i][j] != init) return; //check xem to roi hoac chua
    img[i][j] = color;
    dfs(img, i + 1, j, init, color);
    dfs(img, i, j + 1, init, color);
    dfs(img, i - 1, j, init, color);
    dfs(img, i, j - 1, init, color);
}
}