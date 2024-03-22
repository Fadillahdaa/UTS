package UTS

data class Club(
    val name: String,
    val epl: Int,
    val fa: Int,
    val efl: Int,
    val ucl: Int,
    val uel: Int
) {
    val totalTrophy: Int
        get() = epl + fa + efl + ucl + uel
}
fun Club.recap(): String {
    return "$name berhasil meraih $epl trofi Liga Primer Inggris, $fa trofi FA, $efl trofi EFL, $ucl trofi Liga Champions, dan $uel trofi Liga Eropa UEFA."
}