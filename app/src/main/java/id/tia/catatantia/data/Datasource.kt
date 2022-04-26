package id.tia.catatantia.data

import id.tia.catatantia.R
import id.tia.catatantia.model.catatantia

class Datasource {

    fun loadcatatantia(): List<catatantia> {
        return listOf<catatantia>(
            catatantia(R.string.catatantia1),
            catatantia(R.string.catatantia2),
            catatantia(R.string.catatantia3),
            catatantia(R.string.catatantia4),
            catatantia(R.string.catatantia5),
            catatantia(R.string.catatantia6),
            catatantia(R.string.catatantia7),
            textView.text = Datasource().loadcatatantia().size.toString()

        )
    }
}