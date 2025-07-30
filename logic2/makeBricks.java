public boolean makeBricks(int small, int big, int goal) {
    return big * 5 + small >= goal && goal % 5 <= small;
}
