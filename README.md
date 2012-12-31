SourceCodetoHTML
================

A command line utility that will take a source code file, currently only supports .vhd VHDL sources,
and generates an HTML file that contains a table that displays the source code with line numbers.

Every other line is a different CSS class, allowing typical code styalizaiton for legibitily.

The parser uses plain text files, 3 for VHDL, that contain keywords that will be formatted to
specific colors in the HTML file.  Therefore, if and addition word needs to be blue, simpley add it to
the end of the vhdl_blue.txt file.  These text files must be in the same directory as the running Java class
files.

Usage
-----------------

Once compiled, the class table generator can be run.  The program takes source code file paths as arguments.
