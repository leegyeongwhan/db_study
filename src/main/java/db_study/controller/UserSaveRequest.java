package db_study.controller;

public record UserSaveRequest(
        Long stock,
        String name,
        String email
) {
}
