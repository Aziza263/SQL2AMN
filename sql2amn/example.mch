MACHINE
    GeneratedMachine

SETS
    QUERY_PERFORMED

ABSTRACT_VARIABLES
    r_land, v_type_id

INVARIANT
    state : QUERY_PERFORMED &
    r_land : struct &
    v_type_id : INT

INITIALISATION
    ANY vv WHERE vv : tmp_land THEN r_land := vv END ||
    v_type_id := 0

OPERATIONS

    loop_tmp_land =
        SELECT records_to_transform /= {} THEN
            ANY vv WHERE vv : records_to_transform THEN
                r_land := vv
            END
        END
    ;

END
