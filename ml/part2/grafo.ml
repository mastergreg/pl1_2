(*
datatype Head = HD of (Tree list);
datatype Tree = Empty | Node of (Tree*Tree*int*Tree*Tree);
*)
fun parse file =
  let
    (* Open input file *)
    val input = TextIO.openIn file
    (* Hocus pocus read an integer *)
    val n = Option.valOf (TextIO.scanStream (Int.scan StringCvt.DEC) input)
    fun read_int input = Option.valOf (TextIO.scanStream (Int.scan StringCvt.DEC) input)
    fun read 0 acc = acc
      | read i acc =
        let
          val pair=(read_int input,read_int input)
        in
          read (i-1) (pair::acc)
        end
  in
    read (n-1) nil
  end

(*
fun insert tree (father,child) = 
  let
    fun insertH Node (fRNode,fLNode,data,rNode,lNode) (father,child) = Node (fRNode,fLNode,data,rNode,lNode)
      *)
