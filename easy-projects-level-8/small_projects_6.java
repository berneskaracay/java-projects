class Bob {
    static int enough(final int capacity, final int alreadyOn, final int waiting){
        return Math.max(0, waiting + alreadyOn - capacity);
    }
}