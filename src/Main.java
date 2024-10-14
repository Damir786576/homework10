public class Main {
    public static void main(String[] args) {
        // 1 task
        // I found, now I have to write all code comments in english! Can don't have look this.
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);
        // This task, i'm write first, middle, last name and write in one variable.
        // 2 task
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName);
        // for the accountant's documentation, i'm write fullName in UpperCase.
        // 3 task
        firstName = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName);
        // accountant's documentation don't know letter 'ё'. I wrote a code to replace this letter.
    }
}