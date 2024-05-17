package com.careerit.jfs.cj.basics.recordexamples;


sealed class One permits Two, Three {

}
final class Two extends One {}
sealed class Three extends One permits Four {}

final class Four extends Three {}

public class InheritanceExample {
}
