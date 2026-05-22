
  
    private void gameLoop() {

        while (true) {

            System.out.println("\n===== MENU =====");

            System.out.println("1 - Explore");
            System.out.println("2 - Show Team");
            System.out.println("3 - Exit");

            int option = input.nextInt();

            switch (option) {

                case 1:

                    explore();

                    break;

                case 2:

                    showTeam();

                    break;

                case 3:

                    System.out.println("Goodbye!");

                    return;
            }
        }
    
}
