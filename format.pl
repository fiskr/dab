# formatting Heinlein, yo

use Path::Class;

my $dir = dir("/");

# what a nice book!
my $file = $dir->file("stranger_new.txt"); 


# file handle is an I/O file object we can write to
my $writer = $file->openw();


my @list = ('fish', 'hat', 'loves', ' cake');

foreach my $line ( @list ){

	$writer->print($line . "\n");
}
