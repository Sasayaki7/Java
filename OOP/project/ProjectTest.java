public class ProjectTest{
    public static void main(String[] args) {
        Project proj = new Project();
        Project movementGame = new Project("dancegame");
        Project lobby = new Project("The Lobby", "A waiting room game");
        proj.setDescription("Misc");
        proj.setName("Among us");
        System.out.println(lobby.elevatorPitch());
        System.out.println(proj.elevatorPitch());
        System.out.println(movementGame.getName());
        movementGame.setDescription("OPEN CV");
        System.out.println(movementGame.getDescription());
    }
}