// LANGUAGE: +MultiPlatformProjects
// FIR_IDENTICAL
// RENDER_ALL_DIAGNOSTICS_FULL_TEXT

// MODULE: common
// FILE: common.kt
<!CONFLICTING_KLIB_SIGNATURES_ERROR!>fun foo(): String = ""<!>

expect class A
<!CONFLICTING_KLIB_SIGNATURES_ERROR!>fun bar(x: A): Int = 2<!>

// NOTE: This must be REDECLARATION, see KT-59898
<!CONFLICTING_KLIB_SIGNATURES_ERROR, CONFLICTING_KLIB_SIGNATURES_ERROR!>val param = 0<!>

// MODULE: platform()()(common)
// FILE: platform.kt
<!CONFLICTING_KLIB_SIGNATURES_ERROR!>fun foo(): Int = 0<!>

class B
actual typealias A = B
<!CONFLICTING_KLIB_SIGNATURES_ERROR!>fun bar(x: B): Int = 3<!>

// NOTE: This must be REDECLARATION, see KT-59898
<!CONFLICTING_KLIB_SIGNATURES_ERROR, CONFLICTING_KLIB_SIGNATURES_ERROR!>val param = 0<!>
