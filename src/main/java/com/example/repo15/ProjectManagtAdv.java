package com.example.repo15;

public class ProjectManagtAdv {

    // Enum for task status
    enum TaskStatus {
        TODO, IN_PROGRESS, DONE
    }

    // Class representing a task
    class Task {
        private String taskId;
        private String title;
        private String description;
        private TaskStatus status;
        private String assignee;
        private int estimatedTime;
        private int timeSpent;

        public Task(String taskId, String title, String description, String assignee, int estimatedTime) {
            this.taskId = taskId;
            this.title = title;
            this.description = description;
            this.status = TaskStatus.TODO;
            this.assignee = assignee;
            this.estimatedTime = estimatedTime;
            this.timeSpent = 0;
        }

        // Getters and setters
        public String getTaskId() {
            return taskId;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public TaskStatus getStatus() {
            return status;
        }

        public void setStatus(TaskStatus status) {
            this.status = status;
        }

        public String getAssignee() {
            return assignee;
        }

        public void setAssignee(String assignee) {
            this.assignee = assignee;
        }

        public int getEstimatedTime() {
            return estimatedTime;
        }

        public int getTimeSpent() {
            return timeSpent;
        }

        public void setTimeSpent(int timeSpent) {
            this.timeSpent = timeSpent;
        }
    }

    // Class representing the Project Management Tool
    public class ProjectManagementTool {
        private Map<String, Task> tasks;
        private Map<String, List<String>> comments;

        public ProjectManagementTool() {
            this.tasks = new HashMap<>();
            this.comments = new HashMap<>();
        }

        public void createTask(String taskId, String title, String description, String assignee, int estimatedTime) {
            tasks.put(taskId, new Task(taskId, title, description, assignee, estimatedTime));
            comments.put(taskId, new ArrayList<>());
        }

        public void assignTask(String taskId, String assignee) {
            Task task = tasks.get(taskId);
            if (task != null) {
                task.setAssignee(assignee);
                task.setStatus(TaskStatus.IN_PROGRESS);
            }
        }

        public void updateTaskStatus(String taskId, TaskStatus status) {
            Task task = tasks.get(taskId);
            if (task != null) {
                task.setStatus(status);
            }
        }

        public void updateTimeSpent(String taskId, int time) {
            Task task = tasks.get(taskId);
            if (task != null) {
                task.setTimeSpent(task.getTimeSpent() + time);
            }
        }

        public void addComment(String taskId, String comment) {
            List<String> taskComments = comments.get(taskId);
            if (taskComments != null) {
                taskComments.add(comment);
            }
        }

        public static void main(String[] args) {
            ProjectManagementTool pmTool = new ProjectManagementTool();
            pmTool.createTask("T001", "Implement Login Feature", "Implement login functionality for users", "John", 10);
            pmTool.createTask("T002", "Design Database Schema", "Design the database schema for the application", "Alice", 8);

            pmTool.assignTask("T001", "Emily");
            pmTool.updateTaskStatus("T001", TaskStatus.IN_PROGRESS);
            pmTool.updateTimeSpent("T001", 3);
            pmTool.addComment("T00

        }
