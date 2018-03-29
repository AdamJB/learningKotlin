class Teacher(
        val firstName: String,
        val lastName: String,
        val age: Int,
        val gender: String,
        val currentSubject: String,
        val students: List<Student>) {

    fun studentWithHIghestGrade(): Student? {
        return null;
    }
}