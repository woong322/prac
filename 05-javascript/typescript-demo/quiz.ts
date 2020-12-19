/*
    A key term in typscript is MODULE;

    module refers to a small unit of independant reusuable code.
    When you use the export keyword on a class or function, it becomes a module
*/

class Quiz{
    questionNum: number;
    points: number;
}

export type {Quiz};