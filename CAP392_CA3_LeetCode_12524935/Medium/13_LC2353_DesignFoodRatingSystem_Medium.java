// LeetCode Problem 2353
// Title: Design a Food Rating System
// Difficulty: Medium

class FoodRatings {
    private Map<String, Integer> foodRatingMap = new HashMap<>();
    private Map<String, String> foodCuisineMap = new HashMap<>();
    private Map<String, TreeSet<String>> cuisineFoodMap = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            foodRatingMap.put(food, rating);
            foodCuisineMap.put(food, cuisine);

            cuisineFoodMap.computeIfAbsent(cuisine, k -> new TreeSet<>((a, b) -> {
                int compareRating = Integer.compare(foodRatingMap.get(b), foodRatingMap.get(a));
                if (compareRating != 0) {
                    return compareRating;
                }
                return a.compareTo(b);
            })).add(food);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodCuisineMap.get(food);
        TreeSet<String> foodSet = cuisineFoodMap.get(cuisine);
        
        foodSet.remove(food);
        foodRatingMap.put(food, newRating);
        foodSet.add(food);
    }

    public String highestRated(String cuisine) {
        return cuisineFoodMap.get(cuisine).first();
    }
}