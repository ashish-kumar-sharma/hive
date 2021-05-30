<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class Timestamp
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'secondsSinceEpoch',
            'isRequired' => true,
            'type' => TType::I64,
        ),
    );

    /**
     * @var int
     */
    public $secondsSinceEpoch = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['secondsSinceEpoch'])) {
                $this->secondsSinceEpoch = $vals['secondsSinceEpoch'];
            }
        }
    }

    public function getName()
    {
        return 'Timestamp';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->secondsSinceEpoch);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('Timestamp');
        if ($this->secondsSinceEpoch !== null) {
            $xfer += $output->writeFieldBegin('secondsSinceEpoch', TType::I64, 1);
            $xfer += $output->writeI64($this->secondsSinceEpoch);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
