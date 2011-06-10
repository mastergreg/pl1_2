
fun init x y =4*(x)*(y)+x+y

fun box x y dx dy =  2*(x+1-dx)*(y+1-dy)


fun accept lmin lmax dx dy = 
  let 
    val mhkos = dx*dx+dy*dy
  in
    (lmin*lmin <= mhkos) andalso (lmax*lmax >= mhkos) andalso (dx=1 orelse  dy=1 orelse (((dx mod dy)<>0) andalso ((dy mod dx)<>0)))
  end


fun lines w h lmin lmax = 
  let
    val start = if lmin <= 1 then init w h else 0
    fun linesH w h dx dy lmin lmax acc = 
      if w<dx andalso h<dy 
        then acc
        else
          let
            val (nextdx,nextdy)=if dx<=w then ((dx+1),dy) else (1,dy+1)
          in
            if accept lmin lmax dx dy 
              then linesH w h nextdx nextdy lmin lmax (acc+(box w h dx dy))
              else linesH w h nextdx nextdy lmin lmax acc
          end
  in
    linesH w h 2 1 lmin lmax start
  end
      


