package regex;

public class Main {
/**    Регулярные выражения!
            \					- экранирование
            .					- любой одиночный символ
            \.					- точка
            [ ] 				- любой из них, диапазоны
            [^ ]				- ^ все кроме: любой из них, диапазоны
            ^					- начало строки
            $					- конец строки
            \d	[0-9]			- Цифровой символ
            \D	[^0-9]			- Нецифровой символ
            \s	[ \f\n\r\t\v]	- Пробельный символ
            \S	[^ \f\n\r\t\v]	- Непробельный символ
            \w	[[:word:]]		- Буквенный или цифровой символ или знак подчёркивания
            \W	[^[:word:]]		- Любой символ, кроме буквенного или цифрового символа или знака подчёркивания
            \b 					- граница слова
            \B 					- НЕ граница слова
            (\w|\d|\s)			- варианты или через: |

        Пробельные символы
                - Пробел
            \r	- Возврат каретки (Carriage return, CR)
            \n	- Перевод строки (Line feed, LF)
            \t	- Табуляция (Tab)
            \v	- Вертикальная табуляция (vertical tab)
            \f	- Конец страницы (Form feed). Конец файла.
                        [\b]	- Возврат на 1 символ (Backspace)

        Спецсимволы
            [ ] \ / ^ $ . | ? * + ( ) { }
        Спецсимволы надо экранировать символом \ (обратная косая черта).

                Классы символов
            [[:alnum:]]	- Буквы или цифры: [а-яА-ЯёЁa-zA-Z0-9]
                        [[:alpha:]]	- Только буквы: [а-яА-ЯёЁa-zA-Z]
                        [[:digit:]]	- Только цифры: [0-9]
                        [[:graph:]]	- Только отображаемые символы (пробелы, служебные знаки и т. д. не учитываются)
            [[:print:]]	- Отображаемые символы и пробелы
            [[:space:]]	- Пробельные символы [ \f\n\r\t\v]
                        [[:punct:]]	- Знаки пунктуации: ! " # $ % & ' ( ) * + , \ -. / : ; < = > ? @ [ ] ^ _ ` { | }
                        [[:word:]]	- Буквенный или цифровой символ или знак подчёркивания: [а-яА-ЯёЁa-zA-Z0-9_]

        Квантификация
                {n}		- Ровно n раз
                {m,n}	- От m до n включительно
                {m,}	- Не менее m
                {,n}	- Не более n
            *		- от нуля и выше
            +		- от 1 и выше
            ?		- нуль или 1 раз

        Жадный квантификатор
            *
                    +
                {n,}
        Ленивый квантификатор
            *?
                    +?
                {n,}?

        Для примера с тегами можно написать такое регулярное выражение:
            <[^>]*>



        Examles:

                String patternString = ".*http://.*";
    */
}