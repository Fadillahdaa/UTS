package UTS

fun  main() {
    val clubs = mutableListOf<Club>()
    clubs.add(Club("Liverpool", 19, 8, 9, 6, 3))
    clubs.add(Club("Manchester United", 20, 12, 6, 3, 1))
    clubs.add(Club("Chelsea", 6, 6, 5, 2, 2))
    clubs.add(Club("Manchester City", 8, 8, 8, 0, 0))
    clubs.add(Club("Arsenal", 13, 14, 2, 0, 0))

    val sortedClubs = filterAndSort(clubs, ::sortByNumberTrophyTotal)
    println("Urutan klub berdasarkan jumlah total trofi: ")
    for (club in sortedClubs) {
        println("${club.name}: ${club.totalTrophy} trofi")
    }
    val filteredClubs = filterAndSort(clubs, ::filterByEuropeanTrophy)
    println("\nKlub yang belum pernah memenangkan UCL dan UEL:")
    for (club in filteredClubs) {
        println(club.name)
    }
    println("\nRekap perolehan trofi klub:")
    clubs.forEach { println(it.recap()) }
}
fun filterAndSort(clubs: List<Club>, options: (List<Club>) -> List<Club>): List<Club> {
    return options(clubs)
}
fun sortByNumberTrophyTotal(clubs: List<Club>): List<Club> {
    return clubs.sortedByDescending { it.totalTrophy }
}
fun filterByEuropeanTrophy(clubs: List<Club>): List<Club> {
    return clubs.filter { it.ucl == 0 && it.uel == 0 }
}