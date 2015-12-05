package com.gerryger.workout;

/**
 * Created by user on 2015-12-05.
 */
public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
      new Workout("The Limb Loosener", "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
      new Workout("Core Agony", "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
      new Workout("Strength and Length", "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
