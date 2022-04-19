package models;

import java.util.Arrays;

public class Student extends Person{
    private final int TEST01 = 0;
    private final int TEST02 = 1;
    private final int WORK = 2;
    private final float PASSING_SCORE = 7.0f;

    private String courseName;
    private int registration;
    private float[] evaluations = new float[3];

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public float[] getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(float[] evaluations) {
        this.evaluations = evaluations;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courseName='" + courseName + '\'' +
                ", registration=" + registration +
                ", evaluations=" + Arrays.toString(evaluations) +
                '}';
    }

    public float getAverageScore() {
        float result = (evaluations[TEST01] * 2.5f + evaluations[TEST02] * 2.5f + evaluations[WORK]) / 7.0f;
        return result;
    }

    public float calculatePassingScoreGap() {
        float gap = PASSING_SCORE - getAverageScore();
        return gap > 0 ? gap : 0f;
    }
}
