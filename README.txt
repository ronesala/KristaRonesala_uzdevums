Uzdevums tika pildīts izmanojos Visual Studio Code un tā paplašinājumu "Extension Pack for Java"
Izmantojot šo paplašinājumu arī tiek sniegta iespēja to palaist un atkļūdot.

Ir divi risinājumi udevumam: 

    LetterFrequencyDictionary.java - Saskaitīs alfabēta burtu frekvenci ņemot vērā to izmērus, 
                                tātad - lielais "A" un mazais "a" tiek uzskatīti kā dažādi burti uzskaitē.

    LetterFrequencyDictionaryWithoutSizes.java - Saskaitīs alfabēta burtu frekvenci neņemot vērā to izmērus
                                tātad - lielais "A" un mazais "a" tiek uzskatīti kā burts "a".

Palaižot projektu ir iespēja izvēlēties starp trim testa (.txt) failiem ar ko projektu palaist.
    emptyTest.txt - fails ir tukšs
    loremIpsumTest - ir vairāk kā 1000 simboli 
    simpleTest - ļoti īss un vienkāršs tests

Main metodē jānomaina kuru failu testēt (nomaina file name)
Šo projektu palaiž noklikšķinot run pogu.

Pēc palaišanas tiks izvadīta gan burtu frekvenču vārdnīca, gan automātiskā testa rezultāti.
Ja pievieno jaunu testa failu, tad atiks izvadīta tikai burtu frekvenču vārdnīca.