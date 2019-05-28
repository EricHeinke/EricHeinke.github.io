
public class Alpahbet
{
    public static void main()
    {
        //String[] songList1 = {"Mike's Crazy Forks Club Band","Good Rod","Careful With That Rod","Smells Like Crazy Forks","Somewhere Over the Rod","You Think I Ain't Worth A Rod But I Feel Like A Million Forks","She Thinks Towel's Sexy"};
        //String[] songList2 = {"Look Mike, this is my Rod","Look Joe, this is my Towel","You Can't Drive Through A Buffalo Herd","Baby, I Need Your Aardvarks","Can't Take My Aardvarks Off You","I Drive in Your Arms","She Thinks Towel's Sexy"};
        String[] songList1 = {"Mike's Crazy Forks Club Band","Good Rod","Careful With That Rod","Smells Like Crazy Forks",null,"You Think I Ain't Worth A Rod But I Feel Like A Million Forks",null};
        String[] songList2 = {"Look Mike, this is my Rod","Look Joe, this is my Towel","You Can't Drive Through A Buffalo Herd","Baby, I Need Your Aardvarks","Can't Take My Aardvarks Off You",null,null};
        
        String[] myPlaylist = new String[7];
        
        //populate myPlaylist
        for(int i = 0; i < 7; i++)
        {
            if(!(songList1[i] == null || songList2[i] == null))
            {
                if(songList1[i].compareTo(songList2[i]) < 0){
                    myPlaylist[i] = songList1[i];
                }
                else
                {
                    myPlaylist[i] = songList2[i];
                }
            }
            else
            {
                if(songList1[i] == null)
                {
                    if(songList2[i] == null)
                    {
                        String tmp = null;
                        while(tmp == null)
                        {
                            tmp = songList1[random(0,6)];
                        }
                        myPlaylist[i] = tmp;
                    }
                    else
                    {
                        myPlaylist[i] = songList2[i];
                    }
                }
                else
                {
                    myPlaylist[i] = songList1[i];
                }
            }
        }
        
        //print the lists
        int t1 = 1;
        int t2 = 1;
        for(int i = 0; i < 7; i++)
        {
            if(songList1[i] != null)
            {
                if(songList1[i].length()/8 > t1)
                {
                    t1 = songList1[i].length()/8;
                }
            }
            if(songList2[i] != null)
            {
                if(songList2[i].length()/8 > t1)
                {
                    t2 = songList2[i].length()/8;
                }
            }
        }
        t1++;
        t2++;
        
        System.out.print("Index:\t\tlist1:");
        for(int i = 0; i<t1; i++)
        {
            System.out.print("\t");
        }
        System.out.print("list2:");
        for(int i = 0; i<t2; i++)
        {
            System.out.print("\t");
        }
        System.out.print("list3:");
        System.out.println();
        
        for(int i = 0; i<7; i++)
        {
            System.out.print(i + "\t\t" + songList1[i]);
            if(songList1[i] != null)
            {
                for(int a = 0; a < (t1-(songList1[i].length()/8)); a++)
                {
                    System.out.print("\t");
                }
            }
            else
            {
                for(int a = 0; a < (t1); a++)
                {
                    System.out.print("\t");
                }
            }
            System.out.print(songList2[i]);
            if(songList2[i] != null)
            {
                for(int a = 0; a < (t2-(songList2[i].length()/8)); a++)
                {
                    System.out.print("\t");
                }
            }
            else
            {
                for(int a = 0; a < (t2); a++)
                {
                    System.out.print("\t");
                }
            }
            System.out.print(myPlaylist[i]);
            System.out.println();
        }
    }
    public static int random(int low, int high){
        return (int)((Math.random()*(high-low+1))+low);
    }
}
